package br.com.pockmm.common.domain.datasource

import br.com.pockmm.common.domain.model.RepoModel

interface RepoDataSource {
    suspend fun getRepos(): List<RepoModel>
}