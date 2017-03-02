SUMMARY = "LIRI Web browser"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit qmake5

PV = "0.0.0+git${SRCPV}"

SRC_URI = "git://github.com/lirios/browser.git;branch=develop"
SRCREV = "4f27d0b1abb85ad0166482128570b158c3b446aa"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtdeclarative \
    qtquickcontrols2 \
    fluid \
"

do_configure_prepend() {
    export PREFIX=${prefix}
}

# No links -> runtime dependency
RDEPENDS_${PN} += " \
    slime-engine \
"
