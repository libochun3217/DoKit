package com.didichuxing.doraemonkit.kit.test.utils

import com.didichuxing.doraemonkit.util.RandomUtils
import okio.ByteString


/**
 * didi Create on 2022/3/10 .
 *
 * Copyright (c) 2022/3/10 by didiglobal.com.
 *
 * @author <a href="realonlyone@126.com">zhangjun</a>
 * @version 1.0
 * @Date 2022/3/10 7:45 下午
 * @Description 用一句话说明文件功能
 */
object RandomIdentityUtil {


    fun createPid(url: String): String {
        return ByteString.encodeUtf8(url).md5().hex()
    }

    fun createAid(): String {
        return RandomUtils.random64HexString()
    }

    fun createDid(): String {
        return RandomUtils.random128HexString()
    }


}
