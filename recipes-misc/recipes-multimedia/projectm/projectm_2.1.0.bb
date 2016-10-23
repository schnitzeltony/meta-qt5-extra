SUMMARY = "projectM is a MilkDrop compatible opensource music visualizer"
HOMEPAGE = "https://sourceforge.net/projects/projectm/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=fd92fcd555d2efd7892a388a6933d2c1"

inherit cmake_qt5

DEPENDS += " \
    virtual/libgl \
    glew \
    ftgl \
    libvisual \
    libsdl \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${PV}/projectM-complete-${PV}-Source.tar.gz \
    file://0001-fix-build-wit-gcc-6.patch \
    file://0002-projectM-test-add-missing-build-paths.patch \
    file://0003-projectM-libvisual-set-libvisual-path-correctly.patch \
"
SRC_URI[md5sum] = "debf30f7ce94ff0102f06fbb0cc4e92b"
SRC_URI[sha256sum] = "513204f033006bd3dcdf8aada196d816d6b7187266ddcbb1594d0285cc9406ee"

S = "${WORKDIR}/projectM-complete-${PV}-Source"

# projectm supports qt4 only - disable componenrs asking for qt4
EXTRA_OECMAKE += "-DINCLUDE-PROJECTM-QT=OFF -DINCLUDE-PROJECTM-PULSEAUDIO=OFF"

do_install_append() {
    # original name confuses sanity check for file already in sysroot -> avoild by renaming
    mv '${D}/${datadir}/projectM/presets/Eo.S. - skylight a3 [trip colors flux2]_phat_Multi_shaped2_zoe_colours5.milk' \
       '${D}/${datadir}/projectM/presets/Eo.S. - skylight a3 (trip colors flux2)_phat_Multi_shaped2_zoe_colours5.milk' || true
}

FILES_${PN} += " \
    ${datadir}/projectM \
    ${libdir}/libvisual-0.4/actor/*.so \
"
