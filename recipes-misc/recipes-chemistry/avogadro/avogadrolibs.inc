SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=2b10c3e46ff5e14f9e12acdd42cf9094"

inherit cmake_qt5 pythonnative

PV = "1.90.0"
SRC_URI = "https://github.com/OpenChemistry/${BPN}/archive/${PV}.tar.gz"
SRC_URI[md5sum] = "f2b7014f48da5b2a72d49c01dafaf225"
SRC_URI[sha256sum] = "a562acae129901cb2c9878f5ca4cc8874a8a04260b93a700489dc85dc862c9b7"

# avogadrolibs has lots of include_directories(SYSTEM ${FOO_DIR})
# have no better way to make gcc6 happy
do_configure_append() {
     sed -i 's:-isystem ${STAGING_INCDIR} ::g' `find ${B} -name *.make`
}

