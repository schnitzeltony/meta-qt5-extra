SUMMARY = "Programming language for audio synthesis and algorithmic composition"
HOMEPAGE = "http://supercollider.github.io/"
LICENSE = "GPL-3.0"

SRC_URI = " \
    gitsm://github.com/supercollider/supercollider.git \
    file://0001-server-supernova-utilities-time_tag.hpp-Adding-stati.patch \
"
SRCREV = "a3b8ac73001f315ad01b29b81a97fbf7d03b709f"
PV = "3.10.0"
S = "${WORKDIR}/git/"

LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=d32239bcb673463ab874e80d47fae504"

inherit cmake_qt5 distro_features_check mime

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qttools-native qttools \
    qtbase \
    qtwebengine \
    qtsvg \
    fftw \
    jack \
    libsndfile1 \
    alsa-lib \
    libxt \
"

SIMD_OPTIONS ??= " \
    -DSSE=OFF \
    -DSSE2=OFF \
"

EXTRA_OECMAKE = "\
    -DCMAKE_BUILD_TYPE="Release" \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
    -DBUILD_TESTING=OFF \
    -DENABLE_TESTSUITE=OFF \
    -DNATIVE=OFF \
    ${SIMD_OPTIONS} \
    -DSC_EL=OFF \
"

PACKAGES =+ "${PN}-gedit-plugin"

FILES_${PN} += " \
    ${datadir}/gtksourceview-3.0 \
    ${datadir}/mime \
    ${datadir}/SuperCollider \
    ${libdir}/SuperCollider/plugins/*.so \
"
INSANE_SKIP_${PN} = "useless-rpaths"

FILES_${PN}-gedit-plugin = " \
    ${libdir}/gedit \
"
