SUMMARY = "Simple video player for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/main.cpp;beginline=9;endline=24;md5=abd5b11c017f98f28850382a61e02a30"

inherit qmake5

DEPENDS = "qtbase qtdeclarative qtquickcontrols qtmultimedia"
SRC_URI = " \
	git://github.com/plfiorini/${BPN}.git;protocol=git;branch=master \
	file://0001-Make-install-work.patch \
"
SRCREV = "66290bce6b5a9074f13886b42370f95677ef50d6"
PV = "git${SRCPV}"

S = "${WORKDIR}/git"
