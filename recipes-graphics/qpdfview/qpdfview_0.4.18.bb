SUMMARY = "Light-weight tabbed PDF, DJVU and PostScript viewer"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "cups poppler qtsvg"

SRC_URI = " \
    https://launchpad.net/qpdfview/trunk/${PV}/+download/${BPN}-${PV}.tar.gz \
    file://0001-Fix-build-with-Qt-5.15.patch \
"
SRC_URI[md5sum] = "4d63ee0095e939602f9bf4759ae57953"
SRC_URI[sha256sum] = "cc642e7fa74029373ca9b9fbc29adc4883f8b455130a78ad54746d6844a0396c"

inherit qmake5 mime-xdg

QMAKE_PROFILES = "${S}/qpdfview.pro"
EXTRA_QMAKEVARS_PRE += " \
    CONFIG+=without_ps \
    CONFIG+=without_djvu \
    PLUGIN_INSTALL_PATH=${libdir}/${BPN} \
"

FILES_${PN} += "${datadir}"
