require ${BPN}.inc

inherit native

SRC_URI += " \
	file://0001-native-build-and-install-icemaker-only.patch \
"

DEPENDS += "libpcre-native"
