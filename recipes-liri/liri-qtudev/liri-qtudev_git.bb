SUMMARY = "Qt-style wrapper around udev"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit liri

PV = "1.1.0+git${SRCPV}"

SRCREV = "9ec730754fd9db8459debaeb75a47519f9a527e1"
S = "${WORKDIR}/git"

DEPENDS += " \
    udev \
    umockdev \
"
