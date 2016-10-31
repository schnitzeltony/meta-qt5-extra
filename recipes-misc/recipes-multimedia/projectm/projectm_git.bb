SUMMARY = "projectM is a MilkDrop compatible opensource music visualizer"
HOMEPAGE = "http://projectm-visualizer.github.io/projectm/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=26f590fe167311fe2a5a7ce0b3e71900"

inherit cmake_qt5

DEPENDS += " \
    virtual/libgl \
    glew \
    ftgl \
    libvisual \
    libsdl \
    libsdl2 \
"

SRC_URI = " \
    git://github.com/projectM-visualizer/projectm.git;name=projectm \
	http://spiegelmc.com.s3.amazonaws.com/pub/projectm_presets.zip;name=presets \
    file://0001-Fix-sdl2-build.patch \
    file://0002-workaround-link-failures.patch \
"
SRCREV_projectm = "eafa3251c3af3a801950d588c3b531fbc7cba317"
SRC_URI[presets.md5sum] = "8976d72c05e3f4ddee996c6f2e98fc63"
SRC_URI[presets.sha256sum] = "e323515f0ee5920ec45e4f9efdb55890f028dabb5ae9468fdc97c43d55040614"

S = "${WORKDIR}/git"
PV = "2.2.0+git${SRCPV}"

# why is static default?
EXTRA_OECMAKE += "-DBUILD_PROJECTM_STATIC=OFF"

# projectm supports qt4 only - disable componenrs asking for qt4
EXTRA_OECMAKE += "-DINCLUDE-PROJECTM-QT=OFF -DINCLUDE-PROJECTM-PULSEAUDIO=OFF"

# force gles1
#EXTRA_OECMAKE += "USE_GLES1=ON"

do_install_append() {
	install -d ${D}/${datadir}/projectM/presets
    install -m 0644 ${WORKDIR}/presets/presets_projectM/* ${D}/${datadir}/projectM/presets/
    # original name confuses sanity check for file already in sysroot -> avoild by renaming
    mv '${D}/${datadir}/projectM/presets/Eo.S. - skylight a3 [trip colors flux2]_phat_Multi_shaped2_zoe_colours5.milk' \
       '${D}/${datadir}/projectM/presets/Eo.S. - skylight a3 (trip colors flux2)_phat_Multi_shaped2_zoe_colours5.milk' || true
}

FILES_${PN} += " \
    ${datadir}/projectM \
    ${libdir}/libvisual-0.4/actor/*.so \
"
