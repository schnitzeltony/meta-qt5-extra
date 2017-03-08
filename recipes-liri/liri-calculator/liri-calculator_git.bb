SUMMARY = "LIRI Calculator"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE;md5=8f0e2cd40e05189ec81232da84bd6e1a \
"

inherit qmake5

PV = "0.0.0+git${SRCPV}"

SRC_URI = "git://github.com/lirios/calculator.git"
SRCREV = "b86e70b2e408004408459349db3a7f1a7316570a"
S = "${WORKDIR}/git"

DEPENDS += " \
    qtdeclarative \
    qtquickcontrols2 \
    fluid \
"

# don't share ideas where to install binary
do_install() {
    install -d ${D}/${bindir}
    install -m 0755 ${B}/liri-calculator ${D}/${bindir}/
}
