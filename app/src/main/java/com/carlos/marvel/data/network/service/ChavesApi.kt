package com.carlos.marvel.data.network.service

import java.util.*

val CHAVE_PUBLICA = "c9afd3b8f1c9ec02aec65d71186db389"
val CHAVE_PRIVADA = "09a671a0a87028618bd9c702475696fd5c905011"
val TIMESTAMP = (Calendar.getInstance(TimeZone.getTimeZone("UTC")).timeInMillis / 1000L).toString()
val MD5_HASH = "$TIMESTAMP$CHAVE_PRIVADA$CHAVE_PUBLICA"