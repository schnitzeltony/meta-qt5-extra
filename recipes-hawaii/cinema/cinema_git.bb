SUMMARY = "Simple video player for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/main.cpp;beginline=9;endline=24;md5=abd5b11c017f98f28850382a61e02a30"

inherit qmake5

DEPENDS = "qtbase qtdeclarative qtquickcontrols qtmultimedia fluid"

SRC_URI = " \
	git://github.com/mauios/${BPN}.git;protocol=git;branch=dev \
	file://0001-Make-install-work.patch \
"
SRCREV = "ad3ac6952aca6854b6df7e01e48f10a858dd2529"
PV = "git${SRCPV}"

S = "${WORKDIR}/git"
