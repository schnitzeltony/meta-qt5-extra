SUMMARY = "Web browser"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri

PV = "0.1.0+git${SRCPV}"

SRCREV = "1af85364ec3656c1e2dfe7cf3d8cffac8a022237"
S = "${WORKDIR}/git"

DEPENDS += " \
    slimeengine \
    qtwebengine \
    fluid \
"
