SUMMARY = "A simple build configuration and project generation tool using lua"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=fdafc691aa5fb7f8e2a9e9521fef771b"
HOMEPAGE = "http://premake.github.io/"

DEPENDS = "lua-native"

SRC_URI = " \
    http://downloads.sourceforge.net/project/premake/Premake/${PV}/premake-src-${PV}.zip \
"
SRC_URI[md5sum] = "8d30dc5bbc52aad81abb1509c1dd7d8f"
SRC_URI[sha256sum] = "b59841a519e75d5b6566848a2c5be2f91455bf0cc6ae4d688fcbd4c40db934d5"
S = "${WORKDIR}/Premake-${PV}"

BBCLASSEXTEND = "native"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${S}/bin/premake ${D}${bindir}
}


