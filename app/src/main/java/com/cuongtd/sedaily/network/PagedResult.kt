package com.cuongtd.sedaily.data.network

import androidx.lifecycle.LiveData
import androidx.paging.PagingData
import com.cuongtd.sedaily.utils.Event

data class PagedResult<T : Any>(
    // The LiveData of paged lists for the UI to observe
    val pagedList: LiveData<PagingData<T>>,
    // Represents the network request status to show to the user
    val networkState: LiveData<Event<NetworkState>>,
    // Refreshes the whole data and fetches it from scratch.
    val refresh: () -> Unit
)

sealed class NetworkState {
    object Loading : NetworkState()
    data class Loaded(val itemsCount: Int) : NetworkState()
    data class Error(val message: String?, val isConnected: Boolean) : NetworkState()
}