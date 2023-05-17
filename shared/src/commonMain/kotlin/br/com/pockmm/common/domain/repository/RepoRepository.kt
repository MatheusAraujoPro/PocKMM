package br.com.pockmm.common.domain.repository

import br.com.pockmm.common.domain.model.RepoModel

interface RepoRepository {
    suspend fun getRepos(): List<RepoModel>
}