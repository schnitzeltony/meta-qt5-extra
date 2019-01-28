SUMMARY = "Light-weight tabbed PDF, DJVU and PostScript viewer"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "cups poppler qtsvg"

SRC_URI = "https://launchpad.net/qpdfview/trunk/${PV}/+download/${BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4b317c4536332a7fe437abe50eca1716"
SRC_URI[sha256sum] = "fad416e8fefc3057fa1b8d12d964c7eccd16dffe0307a0d6e9d55a543294da7f"

inherit qmake5

QMAKE_PROFILES = "${S}/qpdfview.pro"
EXTRA_QMAKEVARS_PRE += "CONFIG+=without_ps CONFIG+=without_djvu"

FILES_${PN} += "${datadir}"
