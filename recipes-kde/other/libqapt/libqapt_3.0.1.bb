SUMMARY = "A Qt wrapper library/APT implementation around the libapt-pkg library"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949 \
"

inherit kde-base cmake-lib

DEPENDS += " \
    xapian-core \
    apt \
    polkit-qt-1 \
"

# REVISIT optionals PACKAGECONFIG
DEPENDS += " \
    kauth \
    kcoreaddons \
    ki18n \
    kio \
    krunner \
    ktextwidgets \
    kwidgetsaddons \
    kwindowsystem \
    kiconthemes \
    libdebconf-kde \
    gstreamer1.0 \
    glib-2.0 \
"

SRC_URI[md5sum] = "91016b23f2c30b2a59a8a5c9c2558781"
SRC_URI[sha256sum] = "19aeb20f8a9a0c7377f21e3d03d2319aa80348561872938363c540cb6340b97c"

do_configure_append() {
    # apt sets absolute paths - we should fix that at apt...
    sed -i 's:${STAGING_LIBDIR}/::g' ${B}/CMakeFiles/Export/_usr/lib/cmake/QApt/QAptTargets.cmake
}

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/polkit-1 \
    ${datadir}/kservices5 \
    \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "QApt, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "QApt, -S${includedir}, -S${STAGING_INCDIR}"
