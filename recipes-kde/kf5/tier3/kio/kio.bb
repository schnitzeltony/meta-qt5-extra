SUMMARY = "Resource and network access abstraction"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 cmake-lib cmake-auto-align-paths

DEPENDS += " \
    karchive \
    kcodecs \
    kconfig \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    ki18n \
    knotifications \
    kservice \
    solid \
    kxmlgui \
    kwallet \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/xserver", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f7a87528e9f0fba984323d26773cd553"
SRC_URI[sha256sum] = "db26d787efd4b9f7da1970fb9814bca130f6d3adc578a847e93b4ac5ceadfa30"

PACKAGECONFIG[full] = "-DKIOCORE_ONLY=OFF,-DKIOCORE_ONLY=ON, kbookmarks kcompletion kconfigwidgets kiconthemes kitemviews kjobwidgets kwidgetsaddons kwindowsystem"
# Note that kdeclarative fails without KIOWidgets
PACKAGECONFIG ??= "full"

# REVISIT make optional
DEPENDS += " \
    krb5 \
"

do_configure_append() {
    # fix sysroot path
    sed -i 's:${STAGING_BINDIR_NATIVE}:${bindir}:g' ${B}/src/ioslaves/help/config-help.h
}

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "KF5KIO, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5KIO, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
FILES_${PN}-dbg += " \
    ${libdir}/${BPN}/kf5/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/.debug \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
