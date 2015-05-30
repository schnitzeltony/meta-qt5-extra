SUMMARY = "Base applications for the Hawaii desktop environment"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii pkgconfig

DEPENDS += "polkit-qt-1"

SRCREV = "74d6e19a0736aba338d1594a66cd1f0bd790091f"
PV = "0.4.0"
S = "${WORKDIR}/git"
