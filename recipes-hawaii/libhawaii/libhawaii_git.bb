SUMMARY = "Library shared among Hawaii Shell and other projects"
LICENSE = "GPLv2 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://LICENSE.LGPLv3;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

inherit hawaii

PV = "0.8.0"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "f9cb7389a7881bf924ead7ae4b409c83b7e7a454"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
FILES_${PN}-dev += "${libdir}/cmake"
