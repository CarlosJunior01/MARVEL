package com.carlos.marvel.data.network.service

import java.util.*

val CHAVE_PUBLICA = "COLOQUE AQUI SUA CHAVE PUBLIC KEY"
val CHAVE_PRIVADA = "COLOQUE AQUI SUA CHAVE PRIVATE KEY"
val TIMESTAMP = (Calendar.getInstance(TimeZone.getTimeZone("UTC")).timeInMillis / 1000L).toString()
val MD5_HASH = "$TIMESTAMP$CHAVE_PRIVADA$CHAVE_PUBLICA"