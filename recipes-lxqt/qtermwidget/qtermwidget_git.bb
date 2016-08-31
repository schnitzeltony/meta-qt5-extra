SUMMARY = "The qterminal widget"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit cmake_qt5 cmake_lib cmake_extra_sanity

DEPENDS = "qtbase"

SRC_URI = "git://github.com/lxde/${BPN}.git"
SRCREV = "72ffc262eb6cd5deaf3489068f7fe6a91f734998"
PV = "0.6.0+git${SRCPV}"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DUSE_QT5=ON -DBUILD_DESIGNER_PLUGIN=OFF"

FILES_${PN} += " \
    ${datadir}/qtermwidget5 \
    ${datadir}/cmake \
"

CMAKE_ALIGN_SYSROOT[1] = "qtermwidget5, -S${includedir}, -S${STAGING_INCDIR}"
