SUMMARY = "File manager"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit hawaii

DEPENDS += "qttools"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git;protocol=git;branch=master"
SRCREV = "0f1d9294cbf9d4ac235c31d10b0c7166845e098f"
PV = "0.1.90+git${SRCPV}"

S = "${WORKDIR}/git"

CXXFLAGS += "-fPIC"
EXTRA_OECMAKE += "-DQt5LinguistTools_DIR=${STAGING_LIBDIR_NATIVE}/cmake/Qt5LinguistTools"

FILES_${PN} += "${libdir}/hawaii/qml ${datadir}"
FILES_${PN}-dbg += "${libdir}/hawaii/qml/Swordfish/.debug"
