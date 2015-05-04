SUMMARY = "Support for bookmarks and the XBEL format"
LICENSE = "LGPLv2.1 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
	file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
	file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma

DEPENDS += " \
	kconfig \
	kconfigwidgets \
	kcoreaddons \
	kcrash \
	kglobalaccel \
	ki18n \
	kinit \
	knotifications \
	kservice \
	plasma-framework \
	kwidgetsaddons \
	kwindowsystem \
	\
	kcompletion \
	kdeclarative \
	kcmutils \
	kio \
	knewstuff \
	kxmlgui \
        kdecoration \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libepoxy", "",d)} \
"

# this condition matches always currently - it is kept in this way as a marker
DEPENDS += " \
	${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver qtx11extras libepoxy", "",d)} \
"

# REVISIT: PACKAGECONFIG for optionals
DEPENDS += " \
	kwayland \
	kactivities \
	kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "4cce33510b72d1f4321e529fd00bf7d4"
SRC_URI[sha256sum] = "164f6cac36e12e7aac5ae1fff2c72dc616980751d877d701dd6057d9abac6fd7"

SRC_URI += "file://0001-fix-build-for-qtbase-without-session-management.patch"

# REVISIT: this should be fixed in meta-fsl-arm
CXXFLAGS_append_mx6 = " -DLINUX \
                      ${@base_contains('DISTRO_FEATURES', 'x11', '', \
                                       base_contains('DISTRO_FEATURES', 'wayland', \
                                                     '-DEGL_API_WL -DEGL_API_FB', '', d), d)}"



FILES_${PN} += " \
    ${datadir}/config.kcfg \
    ${datadir}/kservices5 \
    ${datadir}/kwincompositing \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/*5 \
    ${libdir}/${QT_DIR_NAME}/plugins \
    ${libdir}/qml \
    ${libdir}/kconf_update_bin \
"

# taken from bitbake.conf with lucky modification: all lt libraries end with s.so
# only move them to -dev package
FILES_SOLIBSDEV = "${base_libdir}/lib*${SOLIBSDEV} ${libdir}/lib*s${SOLIBSDEV}"
FILES_${PN} += " \
    ${libdir}/*.so \
"


FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/*/*/.debug \
    ${libdir}/*/*/*/.debug \
    ${libdir}/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/.debug \
    ${libdir}/*/*/*/*/*/*/.debug \
"
