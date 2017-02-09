SUMMARY = "Web browser"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
"

inherit liri

PV = "0.0.0+git${SRCPV}"

SRCREV = "5e0c1931a304f015baf5e0c2578a22488907ee54"
S = "${WORKDIR}/git"

DEPENDS += " \
    slimeengine \
    qtwebengine \
    fluid \
"
