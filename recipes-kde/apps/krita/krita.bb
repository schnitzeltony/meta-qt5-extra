SUMMARY = "Krita is a free digital painting application"
LICENSE = "GPLv3 & BSD"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=d32239bcb673463ab874e80d47fae504 \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    qtmultimedia \
    curl \
    poppler \
    boost \
    libraw \
    libeigen \
    exiv2 \
    fftw \
    \
    karchive \
    kconfig \
    kwidgetsaddons \
    kcompletion \
    kcoreaddons \
    kguiaddons \
    ki18n \
    kitemmodels \
    kitemviews \
    kwindowsystem \
    kio \
    kcrash \
"

PV = "3.1.3"
SRC_URI = " \
    ${KDE_MIRROR}/stable/krita/3.1.3/${BPN}-${PV}.tar.gz \
    file://0001-fix-build-with-GLES2.patch \
"
SRC_URI[md5sum] = "e595cfeeb2f3c3b090a573e929db5607"
SRC_URI[sha256sum] = "816b9fa9717b78d8dc3a9c4efd49f7a5e3b7f2a0965f2434c48b708598d1b288"

# krita has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     sed -i 's:-isystem:-I:g' `find ${B} -name *.make`
}

# HACK - but overidable by BSP
LDFLAGSGL = "-lGLESv2"
LDFLAGS += "${LDFLAGSGL}"

FILES_${PN} += " \
    ${datadir}/color \
    ${datadir}/color-schemes \
    ${datadir}/icons \
    ${datadir}/kritaplugins \
    ${libdir}/kritaplugins \
"
