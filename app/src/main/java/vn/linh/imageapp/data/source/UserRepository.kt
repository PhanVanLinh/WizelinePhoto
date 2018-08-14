package vn.linh.imageapp.data.source

import io.reactivex.Single
import vn.linh.imageapp.data.source.local.UserLocalDataSource
import vn.linh.imageapp.data.source.remote.UserRemoteDataSource
import vn.linh.imageapp.data.source.remote.api.response.LoginResponse

/**
 * Created by PhanVanLinh on 8/14/2018.
 * phanvanlinh.94vn@gmail.com
 */
class UserRepository(val userRemoteDataSource: UserRemoteDataSource, userLocalDataSource: UserLocalDataSource) {

    fun login(userName: String): Single<LoginResponse> {
        return userRemoteDataSource.login(userName)
    }
}