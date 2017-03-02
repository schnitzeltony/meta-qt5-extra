SUMMARY = "Web browser"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri

PV = "0.0.0+git${SRCPV}"

SRCREV = "4f27d0b1abb85ad0166482128570b158c3b446aa"
S = "${WORKDIR}/git"

DEPENDS += " \
    slimeengine \
    qtwebengine \
    fluid \
"
