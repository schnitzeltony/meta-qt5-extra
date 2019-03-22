SUMMARY = "Rubber Band Library library for audio time-stretching and pitch-shifting"
HOMEPAGE = "http://breakfastquay.com/rubberband/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=28f6289fba0406b8f491e9b2d5767488"

inherit autotools-brokensep pkgconfig

DEPENDS += " \
    fftw \
    libsamplerate0 \
    vamp-plugin-sdk \
    ladspa-sdk \
"

# fftwf is neon accelerated -> force SINGLE precision
SINGLEPATCH = "${@bb.utils.contains('TUNE_FEATURES', 'neon', 'file://0003-Optional-replace-FFTW_DOUBLE_ONLY-by-FFTW_SINGLE_ONL.patch', '', d)}"

SRC_URI = " \
    http://code.breakfastquay.com/attachments/download/34/${BPN}-${PV}.tar.bz2 \
    file://0001-Do-not-try-to-install-librubberband-jni.so-no-java-p.patch \
    file://0002-Fix-build-for-FFTW_SINGLE_ONLY.patch \
    ${SINGLEPATCH} \
"
SRC_URI[md5sum] = "db0ecb4f1a647bdaf7e43ef2ca2f7883"
SRC_URI[sha256sum] = "86bed06b7115b64441d32ae53634fcc0539a50b9b648ef87443f936782f6c3ca"

EXTRA_OEMAKE += " \
    INSTALL_LIBDIR=${libdir} \
    INSTALL_VAMPDIR=${libdir}/vamp \
    INSTALL_LADSPADIR=${libdir}/ladspa \
    INSTALL_PKGDIR=${libdir}/pkgconfig \
"

CPPFLAGS += "-ftree-vectorize -DPROCESS_SAMPLE_TYPE=float"

FILES_${PN} += " \
    ${datadir}/ladspa \
    ${libdir}/ladspa \
    ${libdir}/vamp \
"
