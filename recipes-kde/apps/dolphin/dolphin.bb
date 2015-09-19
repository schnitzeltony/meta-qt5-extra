SUMMARY = "KDE File Manager"
LICENSE = "GPLv2 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-apps cmake-lib

DEPENDS += " \
    kdoctools \
    kinit \
    kcmutils \
    knewstuff \
    kcoreaddons \
    ki18n \
    kdbusaddons \
    kbookmarks \
    kconfig \
    kio \
    kparts \
    solid \
    kiconthemes \
    kcompletion \
    ktexteditor \
    kwindowsystem \
    knotifications \
    kactivities \
    phonon \
    baloo \
    baloo-widgets \
    kfilemetadata \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "8df0dc7c04a78e8358dd269b7766a328"
SRC_URI[sha256sum] = "5a5e895a1ccd6e423af2a349572658c34469102305c4d6469b047bbf3e29b926"
SRC_URI += " \
    file://0001-align-paths-to-phonon.patch \
    file://0002-fix-build-for-qtbase-without-session-management.patch \
"

FILES_SOLIBSDEV = "${libdir}/libdolphin*${SOLIBSDEV}"

FILES_${PN} += " \
    ${datadir} \
    ${libdir}/libkdeinit5_dolphin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/.debug \
"

# cross libs / headers
CMAKE_ALIGN_SYSROOT[1] = "DolphinVcs, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "DolphinVcs, -S${includedir}, -S${STAGING_INCDIR}"
