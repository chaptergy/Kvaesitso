package de.mm20.launcher2.search

import kotlinx.collections.immutable.ImmutableList
import kotlinx.coroutines.flow.Flow

interface SearchableRepository<T : Searchable> {
    fun search(query: String): Flow<ImmutableList<T>>
}