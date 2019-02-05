SUMMARY = "A C++ library of functions for DSP and Music Informatics purposes"
HOMEPAGE = "https://code.soundsoftware.ac.uk/projects/qm-dsp"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=cbbd794e2a0a289b9dfcc9f513d1996e"


SRC_URI = "https://code.soundsoftware.ac.uk/attachments/download/1582/${BPN}-${PV}.tar.gz "
SRC_URI[md5sum] = "9c7a7b15926000e15a9e3c7c06492e58"
SRC_URI[sha256sum] = "2b203f6dabd0475f13b356945827ae90a4ba4a4bbde935ffc334b50a9c782561"

# we cannot use files in build/linux - these are x86 polluted - so set flags here
CFLAGSADD = "-DNDEBUG -fPIC -ffast-math -DUSE_PTHREADS -I./include"
CFLAGS += "${CFLAGSADD}"
CXXFLAGS  += "${CFLAGSADD}"

do_compile_prepend() {
    cp build/general/Makefile.inc Makefile
}

do_install() {
    # stolen https://aur.archlinux.org/cgit/aur.git/plain/PKGBUILD?h=qm-dsp
    cd ${S}
    install -Dm644 -t ${D}${libdir} libqm-dsp.a
    install -Dm644 -t ${D}${includedir}/qm-dsp/base base/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/chromagram dsp/chromagram/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/keydetection dsp/keydetection/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/mfcc dsp/mfcc/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/onsets dsp/onsets/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/phasevocoder dsp/phasevocoder/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/rateconversion dsp/rateconversion/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/rhythm dsp/rhythm/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/segmentation dsp/segmentation/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/signalconditioning dsp/signalconditioning/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/tempotracking dsp/tempotracking/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/tonal dsp/tonal/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/transforms dsp/transforms/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/dsp/wavelet dsp/wavelet/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/maths maths/*.h 
    install -Dm644 -t ${D}${includedir}/qm-dsp/thread thread/*.h 
}
