DESCRIPTION = "Extra modules and scripts for CMake"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING-CMAKE-SCRIPTS;md5=54c7042be62e169199200bc6477f04d1"

inherit cmake

SRC_URI = "git://anongit.kde.org/extra-cmake-modules;protocol=git"
SRCREV = "6e5dd4943be1200f9f7f6620d69f140428abff45"
PV = "0.0.9+git${SRCPV}"

S = "${WORKDIR}/git"

BBCLASSEXTEND = "native"

FILES_${PN} += "${datadir}/ECM"
