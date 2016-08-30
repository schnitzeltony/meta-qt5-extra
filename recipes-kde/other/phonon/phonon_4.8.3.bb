SUMMARY = "The Phonon multimedia library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

SRC_URI += " \
    file://0001-fix-PHONON_LIBRARY_PATH-was-usr-usr-lib-qt5-plugins.patch \
    file://fix-qt-5.4.2-or-newer.patch \
"
SRC_URI[md5sum] = "88bb9867261803eed61ff53a7c026338"
SRC_URI[sha256sum] = "a1149c961ca1570968d070bbd23671e614aa506f847ca93748960e309f85da16"

EXTRA_OECMAKE += "-DPHONON_BUILD_DEMOS=ON -DPHONON_BUILD_PHONON4QT5=ON -D__KDE_HAVE_GCC_VISIBILITY=NO"

# qml-plugin broken currently!
PACKAGECONFIG[qml-plugin] = "-DPHONON_BUILD_DECLARATIVE_PLUGIN=ON,-DPHONON_BUILD_DECLARATIVE_PLUGIN=OFF,qtquick1"
PACKAGECONFIG[designer-plugin] = "-DPHONON_BUILD_DESIGNER_PLUGIN=ON,-DPHONON_BUILD_DESIGNER_PLUGIN=OFF,qttools"

PACKAGECONFIG ??= ""

PACKAGES =+ "${PN}-designer-plugin-dbg ${PN}-designer-plugin"
FILES_${PN}-designer-plugin = "${OE_QMAKE_PATH_PLUGINS}/designer"
FILES_${PN}-designer-plugin-dbg = "${OE_QMAKE_PATH_PLUGINS}/designer/.debug"

FILES_${PN} += "${datadir}/dbus-1"
FILES_${PN}-dev += "${datadir}${QT_DIR_NAME}/mkspecs ${datadir}/phonon4qt5/buildsystem"
