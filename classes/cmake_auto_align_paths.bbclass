CMAKE_ALIGN_FILES_FIND ??= "*Targets.cmake"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '${CMAKE_ALIGN_FILES_FIND}'` ${CMAKE_ADD_ALIGN_FILES} ; do
        sed -i 's:${STAGING_INCDIR_NATIVE}:${includedir}:g' "$f"
        sed -i 's:${STAGING_INCDIR}:${includedir}:g' "$f"
        sed -i 's:${STAGING_LIBDIR_NATIVE}:${libdir}:g' "$f"
        sed -i 's:${STAGING_LIBDIR}:${libdir}:g' "$f"
        sed -i 's:${STAGING_BASELIBDIR_NATIVE}:${base_libdir}:g' "$f"
        sed -i 's:${STAGING_BASELIBDIR}:${base_libdir}:g' "$f"
    done
}

