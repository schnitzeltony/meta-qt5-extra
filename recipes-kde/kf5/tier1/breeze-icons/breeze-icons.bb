require ${BPN}.inc

inherit gtk-icon-cache

DEPENDS += "${BPN}-native"

SRC_URI += "file://0002-use-native-qrcAlias.patch"

FILES_${PN} += "${datadir}/icons"
