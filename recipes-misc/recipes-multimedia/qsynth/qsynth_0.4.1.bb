SUMMARY = "Qt GUI Interface for FluidSynth"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += " \
"

inherit cmake_qt5

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${PV}/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1fc967c1aa0b468e9be1916e6fe836a4"
SRC_URI[sha256sum] = "50f4e36e0c5a7e092429e1cafbd8989346127b8b0c0868566addcacc5735970c"

