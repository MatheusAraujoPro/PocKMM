package br.com.pockmm.common.domain.usecase

import br.com.pockmm.common.domain.model.RepoModel
import br.com.pockmm.common.domain.repository.RepoRepository

class GetReposUseCase(
    private val repository: RepoRepository
) {
    suspend operator fun invoke(): List<RepoModel> {
        return repository.getRepos()
    }
}