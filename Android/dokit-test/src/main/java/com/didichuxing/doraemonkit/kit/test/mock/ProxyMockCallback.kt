package com.didichuxing.doraemonkit.kit.test.mock

import com.didichuxing.doraemonkit.kit.connect.data.TextPackage


/**
 * didi Create on 2022/4/11 .
 *
 * Copyright (c) 2022/4/11 by didiglobal.com.
 *
 * @author <a href="realonlyone@126.com">zhangjun</a>
 * @version 1.0
 * @Date 2022/4/11 2:56 下午
 * @Description 用一句话说明文件功能
 */

interface ProxyMockCallback {

    fun send(data: String)
}

interface MockResponseCallback {
    fun onResponse(key: String, data: String)
}

interface MockQueryRequestCallback {
    fun onRequest(textPackage: TextPackage)
}
