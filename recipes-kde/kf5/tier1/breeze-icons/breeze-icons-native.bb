require ${BPN}.inc

inherit native

SRC_URI += "file://0002-build-native-qrcAlias-only.patch"

do_install() {
    install -d ${D}/${bindir}
    install -m 755 ${B}/bin/qrcAlias ${D}/${bindir}/
}
