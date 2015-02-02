SUMMARY = "The Phonon multimedia library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde cmake-lib

SRCREV = "e08fdba6b64ad6a09a9dcd6696de4d82f2dd8224"
S = "${WORKDIR}/git"

EXTRA_OECMAKE += "-DPHONON_BUILD_DEMOS=ON -DPHONON_BUILD_PHONON4QT5=ON"

# qml-plugin broken currently!
PACKAGECONFIG[qml-plugin] = "-DPHONON_BUILD_DECLARATIVE_PLUGIN=ON,-DPHONON_BUILD_DECLARATIVE_PLUGIN=OFF,qtquick1"
PACKAGECONFIG[designer-plugin] = "-DPHONON_BUILD_DESIGNER_PLUGIN=ON,-DPHONON_BUILD_DESIGNER_PLUGIN=OFF,qttools"

PACKAGECONFIG ??= ""

do_install_append() {
	# somebody with a better solution?
	sed -i 's:${_IMPORT_PREFIX}:${prefix}:g' ${D}${libdir}/cmake/phonon4qt5/PhononTargets.cmake
}

# cross libs / headers
CMAKE_HIDE_ERROR[1] = "phonon4qt5, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_HIDE_ERROR[2] = "phonon4qt5, -S${includedir}, -S${STAGING_INCDIR}"

PACKAGES =+ "${PN}-designer-plugin-dbg ${PN}-designer-plugin"
FILES_${PN}-designer-plugin = "${libdir}/qt5/plugins/designer"
FILES_${PN}-designer-plugin-dbg = "${libdir}/qt5/plugins/designer/.debug"

FILES_${PN} += "${datadir}/dbus-1"
FILES_${PN}-dev += "${datadir}/${QT_DIR_NAME}/mkspecs ${datadir}/phonon4qt5/buildsystem"
