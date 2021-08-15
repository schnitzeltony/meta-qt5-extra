require ${BPN}.inc

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}-native:"

inherit native

SRC_URI += " \
    file://0001-native-build-encodefile-only.patch \
"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/bin/* ${D}${bindir}
}
