SUMMARY = "Framework for creation and generation of reports"
HOMEPAGE = "https://community.kde.org/KReport"
LICENSE = "LGPLv2 & GFDL-1.2 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=1634220ce20ef95161c3b8401908638c \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps

DEPENDS += " \
    kproperty \
    \
    kcoreaddons-native \
    kcoreaddons \
    kconfig-native \
    kconfig \
    kwidgetsaddons \
    kguiaddons \
    \
    marble \
    qtwebkit \
"

SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz \
    file://0001-Do-not-rely-on-python2.patch \
    file://0001-Fix-build-with-GCC-10-make-KReportGroupTracker-use-C.patch \
"
SRC_URI[sha256sum] = "22716d719654e8f887fe4d33654e252ddf3d3d818c44e15a8af0e6f2e7d6ccd7"

FILES_${PN} += " \
    ${datadir}/kservicetypes5 \
    ${datadir}/kreport3 \
    ${OE_QMAKE_PATH_PLUGINS} \
"
