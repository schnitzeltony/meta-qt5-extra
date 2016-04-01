require ${BPN}.inc

inherit native

SRC_URI += " \
    file://0002-native-build-and-install-icemaker-only.patch \
"

DEPENDS += " \
    libpcre-native \
    kdoctools \
"
