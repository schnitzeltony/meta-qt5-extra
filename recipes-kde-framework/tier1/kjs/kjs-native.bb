require ${BPN}.inc

inherit native

SRC_URI += " \
	file://0001-install-icemaker-we-need-the-native-one-for-cross-co.patch \
"

DEPENDS += "libpcre-native"
