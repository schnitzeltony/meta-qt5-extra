SUMMARY = "KDE's window manager native helper"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
"

require ${BPN}.inc

inherit kde-plasma native

SRC_URI += "file://CMakeLists.txt"

OECMAKE_SOURCEPATH = "${WORKDIR}"

do_configure:prepend() {
    cp -f ${S}/src/effects/strip-effect-metadata.cpp ${WORKDIR}
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/kwin-strip-effect-metadata ${D}${bindir}
}
