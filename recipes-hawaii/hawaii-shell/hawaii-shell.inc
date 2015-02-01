SUMMARY = "Hawaii desktop environment shell"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPL;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPL;md5=4fbd65380cdd255951079008b364516c \
"

inherit cmake_qt5 pythonnative

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master"
SRCREV = "00d454fb651ea8d8a949a7a94fbda8d906bf3e43"
PV = "0.3.90+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS += "extra-cmake-modules-native"
