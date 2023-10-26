package com.getcapacitor.community.ironsource.rewarded.models

import com.getcapacitor.PluginCall

class SsvInfo(
    val customData: String? = null,
    val userId: String? = null) {

    constructor(pluginCall: PluginCall?) : this(
        pluginCall?.getObject("ssv")?.getString("customData"),
        pluginCall?.getObject("ssv")?.getString("userId")
    )

    constructor() : this(null, null)

    val hasInfo
        get(): Boolean {
            return customData != null || userId != null
        }
}