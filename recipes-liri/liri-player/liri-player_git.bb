SUMMARY = "Cross-platform media player"
LICENSE = "AGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=4e2aee3f50167a8482c5b569294ffe7a \
"

inherit qmake5

DEPENDS += " \
    qtmultimedia \
    vlc \
"

LIRI_GIT_BRANCH ?= "develop"
SRC_URI = "gitsm://github.com/lirios/${@'${BPN}'.replace('liri-', '')}.git;protocol=git;branch=${LIRI_GIT_BRANCH}"
SRCREV = "dceddc6f941ee7249e7253a88b7e4f34251fc83f"
S = "${WORKDIR}/git"
PV = "0.0.0+git${SRCPV}"

do_install() {
    install -d ${D}${bindir}
    install -m 755 ${B}/liri-player ${D}${bindir}
}
