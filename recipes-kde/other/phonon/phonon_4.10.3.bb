SUMMARY = "The Phonon multimedia library"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-base

DEPENDS += "alsa-lib"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${PV}/${BPN}-${PV}.tar.xz"
SRC_URI += " \
    file://0001-fix-PHONON_LIBRARY_PATH-was-usr-usr-lib-qt5-plugins.patch \
"
SRC_URI[md5sum] = "839e7ddc5bc5284cf4cffb8ebd00b4f7"
SRC_URI[sha256sum] = "2e8b145669afa0e93833e4064b657677abc9413e4007fa5ddc91397c9bddc295"

EXTRA_OECMAKE += "-DPHONON_BUILD_DEMOS=ON -DPHONON_BUILD_PHONON4QT5=ON -D__KDE_HAVE_GCC_VISIBILITY=NO"

PACKAGECONFIG[designer-plugin] = "-DPHONON_BUILD_DESIGNER_PLUGIN=ON,-DPHONON_BUILD_DESIGNER_PLUGIN=OFF,qttools"
PACKAGECONFIG[pulseaudio] = "-DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=FALSE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=FALSE, -DCMAKE_DISABLE_FIND_PACKAGE_PULSEAUDIO=TRUE -DCMAKE_DISABLE_FIND_PACKAGE_GLIB2=TRUE,pulseaudio glib-2.0"

PACKAGECONFIG ??= "${@bb.utils.filter('DISTRO_FEATURES', 'pulseaudio', d)}"

PACKAGES =+ "${PN}-designer-plugin"
FILES_${PN}-designer-plugin = "${OE_QMAKE_PATH_PLUGINS}/designer"

FILES_${PN} += "${datadir}/dbus-1"
FILES_${PN}-dev += "${datadir}/qt5/mkspecs ${OE_QMAKE_PATH_ARCHDATA}/mkspecs ${datadir}/phonon4qt5/buildsystem"
