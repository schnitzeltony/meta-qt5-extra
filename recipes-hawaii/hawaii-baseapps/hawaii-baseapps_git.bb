SUMMARY = "Base applications for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii pkgconfig

DEPENDS += "polkit-qt-1"

SRCREV = "b913c123f87d59e584a96d3d4c31dffaeb8dca24"
PV = "0.4.90+git${SRCPV}"
S = "${WORKDIR}/git"
